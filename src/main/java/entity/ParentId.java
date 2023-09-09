package entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * 식별자 클래스가 만족해야할 조건
 * 1. Serializable 인터페이스를 구현해야 한다.
 * 2. equals, hashCode를 구현해야 한다.
 * 3. 기본 생성자가 있어야 한다.
 * 4. 식별자 클래스는 public이어야 한다.
 */
public class ParentId implements Serializable {

    private String id1; // Parend.id1 매핑
    private String id2; // Parent.id2 매핑

    public ParentId() {

    }

    public ParentId(String id1, String id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParentId parentId = (ParentId) o;
        return Objects.equals(id1, parentId.id1) && Objects.equals(id2, parentId.id2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id1, id2);
    }

}