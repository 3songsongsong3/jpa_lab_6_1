package entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * 복합키 : 비식별 관계 매핑
 * @IdClass로 식별자 클래스를 지정
 *  관계형 데이터베이스에 가까운 방법
 */
@Entity
@IdClass(ParentId.class)
public class Parent {

    @Id
    @Column(name = "PARENTID_1")
    private String id1;

    @Id
    @Column(name = "PARENTID_2")
    private String id2;

    private String name;
}
