package cn.bdqn.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 日期类型的转换器     String--->Date
public class String2Date implements Converter<String, Date> {

    @Override
    public Date convert(String value) {
        if(value == null || "".equals(value.trim())){
            return null;
        }

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return sdf1.parse(value);
        } catch (Exception e) {
            sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                return sdf1.parse(value);
            } catch (Exception ex) {
                sdf1 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
                try {
                    return sdf1.parse(value);
                } catch (ParseException exc) {
                    exc.printStackTrace();
                    throw new RuntimeException(exc);
                }
            }
        }
    }
}
