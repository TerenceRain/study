package compile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

//通过这个类创建进程，并执行javac， java等命令
public class CommandUtil {
//    run方法表示用于创建进程并执行命令
//    cmd表示要执行的命令
//    stdoutFile指定标准输出写到哪个文件中
//    stderrFile指定标准错误写到哪个文件中
    public static int run(String cmd, String stdoutFile, String stderrFile) throws IOException, InterruptedException {
//        可以使用多个Runtime进行进程的创建
//        Runtime在使用的时候并不需要手动创建实例
//        一个java程序里，Runtime的实例只有唯一一个
//        这个process对象其实就是用来表示新创建出来的这个进程。
        Process process = Runtime.getRuntime().exec(cmd);
        if(stdoutFile != null){
//            getInputStream获取到的是标准输出
            InputStream stdoutFrom = process.getInputStream();
//            通过这个对象就可以读取到当前进程的标准输出内容
            FileOutputStream stdoutTo = new FileOutputStream(stdoutFile);
//            接下来从新进程中一次读取每个字节，写入到stdoutTo这个文件
            while(true){
                int ch = stdoutFrom.read();
                if(ch == -1){
                    break;
                }
                stdoutTo.write(ch);
            }
//            文件读写完毕，关闭文件
            stdoutFrom.close();
            stdoutTo.close();
        }
//        再对标准错误进行重定向
        if(stderrFile != null){
//            getErrorStream得到的是标准错误
            InputStream stderrFrom = process.getErrorStream();
            FileOutputStream stderrTo = new FileOutputStream(stderrFile);
            while(true){
                int ch = stderrFrom.read();
                if(ch == -1){
                    break;
                }
                stderrTo.write(ch);
            }
            stderrFrom.close();
            stderrTo.close();
        }
//        等待新进程结束，并获取到退出码
        int exitCode = process.waitFor();
        return  exitCode;


    }

    public static void main(String[] args) {
        try {
            int ret = CommandUtil.run("cmd", "./stdout.txt", "./stderr.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
