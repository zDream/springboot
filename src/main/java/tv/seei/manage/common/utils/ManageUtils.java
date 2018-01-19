package tv.seei.manage.common.utils;

import tv.seei.manage.common.constants.ManageConstant;

import java.util.HashMap;
import java.util.Map;

public class ManageUtils {
    public static Map<String,Object> initAjaxResponseMap(){
        Map<String,Object> response = new  HashMap<String,Object>();
        response.put("code",ManageConstant.AJAX_FAIL);
        return response;
    }

    public static void setInitAjaxResponseMap(Map<String,Object> response){
        response.put("code",ManageConstant.AJAX_SUCCESS);
    }
}
