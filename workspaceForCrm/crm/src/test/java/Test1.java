import com.bjpowernode.crm.utils.DateTimeUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        //验证失效时间
        /*String expireTime = "2019-10-10 10:10:10";

        String currentTime = DateTimeUtil.getSysTime();

        int count = expireTime.compareTo(currentTime);

        System.out.println(count);
*/
        String lockState = "0";
        if ("0".equals(lockState)){
            System.out.println("账号锁定");
        }

    }
}
