package tv.seei.manage.ais.service;

import org.springframework.stereotype.Service;

public interface AisService {
    /**
     *
     * @param s 要解析的ais数据
     * @param msgdatum 整条ais 数据
     */
    void decodeConvert(String s, String msgdatum);
}
