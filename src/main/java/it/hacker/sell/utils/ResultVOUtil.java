package it.hacker.sell.utils;

import it.hacker.sell.vo.ResultVO;

/**
 * @author wqh
 * @date 18-10-20
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){

        ResultVO<Object> objectResultVO = new ResultVO<>();
        objectResultVO.setMsg("成功");
        objectResultVO.setCode(0);
        objectResultVO.setData(object);
        return  objectResultVO;
    }
    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer errorCode,String msg){
        ResultVO<Object> objectResultVO = new ResultVO<>();
        objectResultVO.setCode(errorCode);
        objectResultVO.setMsg(msg);
        return objectResultVO;
    }

}
