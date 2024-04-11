package com.javaex.api.generic;

// Generic
// 설계시 - 내부 데이터 타입을 미정 상태로 남겨두고
// 실제 객체화 시 - 외부에서 내부 데티어 타입을 결정해 주는 방식.
public class GenericBox<T> {
    T content;
    // T : 타입
    // E : 요소, List
    // K : Key, 예를들어 <k,v>
    // V : 리턴 값 또는 매핑된 값(Variable)
    // R : Return 타입

    public T getContent(){
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
