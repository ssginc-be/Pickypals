package com.pickypal.api.incoming;

import com.pickypal.api.item.Item;
import com.pickypal.api.supplier.Supplier;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/**
 * @author Queue-ri
 */

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class HeadIncomingItem {
    @Id
    @Column(name="incoming_id")
    private String id;

    @ManyToOne
    @JoinColumn(name="item_id")
    private Item item;

    private Integer quantity;

    @CreationTimestamp
    private LocalDateTime inTime;
}
