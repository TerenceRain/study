package compile;

import util.FileUtil;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Task{
//    此处罗列出需要的临时文件（用于进程间通信）文件名约定
//    所有的临时文件需要放进这个目录中
    private String WORK_DIR;
//    要编译执行的类的名字，影响到源代码的文件名
    private  String CLASS = "Solution";
    private String CODE;
    private String STDOUT;
    private String STDERR;
    private String COMPILE_ERROR;


    public Task(){
//        先生成唯一的id，在根据这个id来拼装出目录的名字
        WORK_DIR = "./tmp/" + UUID.randomUUID().toString() + "/";
        CODE = WORK_DIR + CLASS + ".java";
        STDOUT = WORK_DIR + ".stdout.txt";
        STDERR = WORK_DIR + ".stderr.txt";
        COMPILE_ERROR = WORK_DIR + "compile_error.txt";


    }
//    question表示用户提交的代码
//    answer表示代码的编译运行结果

    public Answer compileAndRun(Question question) throws IOException, InterruptedException {
        Answer answer = new Answer();

        File file = new File(WORK_DIR);
        if(!file.exists()){
            file.mkdirs();
        }

        FileUtil.writeFile(CODE,question.getCode());

        String compileCmd = String.format("javac -encoding utf-8 " +
                "%s -d %s", CODE, WORK_DIR);
        System.out.println("编译命令：" + compileCmd);

        CommandUtil.run(compileCmd, null, COMPILE_ERROR);

        String compileError = FileUtil.readFile(COMPILE_ERROR);
        if(!compileError.equals("")){
            answer.setErrno(1);
            answer.setReason(compileError);
            return answer;
        }

        String runCmd = String.format("java -classpath %s %s",WORK_DIR , CLASS);
        System.out.println("运行命令：" + runCmd);
        CommandUtil.run(runCmd, STDOUT, STDERR);
        String runError = FileUtil.readFile(STDERR);
        if(!runError.equals("")){
            answer.setErrno(2);
            answer.setReason(runError);
            return answer;
        }

        answer.setErrno(0);
        String runStdout = FileUtil.readFile(STDOUT);
        answer.setStdout(runStdout);
        return answer;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Task task = new Task();
        Question question = new Question();
        question.setCode("public class Solution {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"stdout\");\n" +
                "        String s = null;\n" +
                "        System.out.println(s.length());\n" +
                "    }\n" +
                "}\n");
        Answer answer = task.compileAndRun(question);
        System.out.println(answer);
    }

}