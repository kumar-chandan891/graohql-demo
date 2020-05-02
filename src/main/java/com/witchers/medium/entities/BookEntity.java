package com.witchers.medium.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@Getter
@Setter
public class BookEntity {

    @Id
    private Integer id;
    @Column(name = "author_id")
    private int authorId;
    @Column(name = "author_name")
    private String authorName;
    @Column(name = "publisher_id")
    private int publisherId;
    @Column(name = "publisher_name")
    private String publisherName;
    @Column(name = "available")
    private boolean available;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "updated_on")
    private Date updatedOn;
}
