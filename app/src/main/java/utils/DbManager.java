package utils;

import android.content.Context;

/**主要是对数据库操作的工具类
 * Created by Administrator on 2019/3/4.
 */
//使用单例模式
public class DbManager {
    private static MySqliteHelper helper;
    public static MySqliteHelper getIntance(Context context){
        if(helper == null){
            helper = new MySqliteHelper(context);
        }
        return helper;  //不为空返回helper对象
    }
}
