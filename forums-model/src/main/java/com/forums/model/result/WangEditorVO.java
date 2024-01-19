package com.forums.model.result;

import lombok.Data;

@Data
public class WangEditorVO {
    //错误码
    private Integer errno;

    //data数据
    private Object data;

    public Integer getErrno() {
        return errno;
    }
    public Object getData() {
        return data;
    }
    public static WangEditorVO success(Object data) {
        WangEditorVO wangEditorVO = new WangEditorVO();
        wangEditorVO.errno = 0;
        wangEditorVO.data = data;
        return wangEditorVO;
    }
    public static WangEditorVO error(Integer errno, Object data) {
        WangEditorVO wangEditorVO = new WangEditorVO();
        wangEditorVO.errno = errno;
        wangEditorVO.data = data;
        return wangEditorVO;
    }
}
