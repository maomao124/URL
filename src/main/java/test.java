import java.net.URL;

/**
 * Project name(项目名称)：URL
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/19
 * Time(创建时间)： 12:30
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        try
        {
            URL url = new URL("https://www.bilibili.com/");
            System.out.println(url.toString());
            System.out.println(url.getProtocol());
            System.out.println(url.getPort());
            System.out.println(url.getHost());
            System.out.println(url.getQuery());
            System.out.println(url.getPath());
            System.out.println(url.getFile());
            System.out.println(url.getRef());
            System.out.println(url.getUserInfo());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
