package com.tf.structure_pattern.decorator;

import java.util.Base64;

/**
 * 加密装饰
 */
public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        //加密数据
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        //解密数据
        return decode(super.readData());
    }

    //解密方法
    private String decode(String data){
        byte[] result = Base64.getMimeDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte)1;
        }
        return new String(result);
    }

    //加密方法
    private String encode(String data){
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length ; i++) {
            result[i] += (byte)1;
        }
        return Base64.getEncoder().encodeToString(result);
    }
}
