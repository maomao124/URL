import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Project name(项目名称)：URL
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/19
 * Time(创建时间)： 12:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test2
{
    public static void main(String[] args) throws IOException
    {
        //下载地址
        URL url = new URL("https://img.t.sinajs.cn/t6/style/images/global_nav/WB_logo.png?id=1404211047727");
        //连接到这个资源 HTTP
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        InputStream inputStream = httpURLConnection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("weibo.jpg");
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(buffer)) != -1)
        {
            fileOutputStream.write(buffer, 0, len);
        }
        //释放资源
        httpURLConnection.disconnect();//断开连接
        inputStream.close();
        fileOutputStream.close();
    }
}
