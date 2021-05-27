package compile;

import java.util.UUID;

//用这个类表示一个完整的编译运行过程
public class Task {
//    此处罗列出需要的临时文件（用于进程间通信）文件名约定
//    所有的临时文件需要放进这个目录中
    private String WORK_DIR;
//    要编译执行的类的名字，影响到源代码的文件名
    private String CLASS = "Solution";
//    要编译的文件名
    private String CODE;
//    程序标准输出放置的文件
    private String STDOUT;
//    程序标准错误放置的文件
    private String STDERR;
//    程序编译出错详细信息放置的文件
    private String COMPILE_ERROR;


    public Task(){
//        先生成唯一的id，再根据这个id来拼装出目录的名字
        WORK_DIR = "./tmp/" + UUID.randomUUID().toString() + "/";
//        然后再生成后续的这些文件名
        CODE = WORK_DIR + CLASS + ".java";
        STDOUT = WORK_DIR + "stdout.txt";
        STDERR = WORK_DIR + "stderr.txt";
        COMPILE_ERROR = WORK_DIR + "compile_error.txt";


    }
//        question表示用户提交的代码
//        Answer表示代码的编译运行结果
    public Answer compileAndRun(Question question){

    }

    public static void main(String[] args) {
        Question question = new Question();
    }
}
