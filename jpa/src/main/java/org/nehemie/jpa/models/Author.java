package org.nehemie.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseEntity {
    
    @Column(
            name = "f_name",
            length = 35
    )
    private String firstName;
    
    private String lastName;
    
    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    
    private int age;
    
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
    
//    @Column(
//            updatable = false,
//            nullable = false
//    )  
//    private LocalDateTime createdAt;
//    
//    @Column(
//            insertable = false // when first created
//    )
//    private LocalDateTime lastModified;
}
