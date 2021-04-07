package com.bdq.demo.common;

import com.bdq.demo.common.util.StringUtil;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author: bdq
 * @Date: 16:41 2021/4/6
 */
@Data
@AllArgsConstructor
public class CommonResult implements Serializable {

    private Integer code; //结果码

    private String msg;//提示信息

    private Object object;//结果数据


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static CommonResult getSuccessResult(String msg, Object object){
        return new CommonResult(ConstantModel.SUCCESS_CODE,msg,object);
    }
    public static CommonResult getSuccessResult(String msg){
        return new CommonResult(ConstantModel.SUCCESS_CODE,msg,new Object());
    }
    public static CommonResult getSuccessResult(){
        return new CommonResult(ConstantModel.SUCCESS_CODE, ConstantModel.EMPTY_STR,new Object());
    }

    public static CommonResult getFailResult(String msg,Object object){
        return new CommonResult(ConstantModel.FAIL_CODE,msg,object);
    }
    public static CommonResult getFailResult(String msg){
        return new CommonResult(ConstantModel.FAIL_CODE,msg,new Object());
    }
    public static CommonResult getFailResult(){
        return new CommonResult(ConstantModel.FAIL_CODE, ConstantModel.EMPTY_STR,new Object());
    }


}
