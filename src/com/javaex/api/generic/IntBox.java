package com.javaex.api.generic;

// 내부에 오직 Integer 만 담길수 있는 상자
public class IntBox {
    Integer content;

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }
}
