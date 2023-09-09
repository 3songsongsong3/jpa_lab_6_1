package entity;

import javax.persistence.*;

@Entity
public class Child {

    @Id
    private String id;


    // 부모 테이블의 기본 키 컬럼이 복합 키 이므로 자식 테이블의 외래 키도 복합키다.
    // 외래 키 매핑 시 여러 컬럼을 매핑해야 하므로 @JoinColums 어노테이션을 사용하고 각각의 외래키 컬럼을 JoinColumn으로 매핑한다.
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PARENT_ID1",
                        referencedColumnName = "PARENT_ID1"),
            @JoinColumn(name = "PARENT_ID2",
                    referencedColumnName = "PARENT_ID2"),
    })
    private Parent parent;

}
