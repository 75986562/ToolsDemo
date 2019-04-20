package com.hfi.web01.mybatisPlus.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author NZH
 * @since 2019-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "p_no", type = IdType.AUTO)
    private String pNo;

    private String pName;

    private BigDecimal price;

    private Integer pAmount;

    private Integer version;

    private LocalDateTime createtime;

    private LocalDateTime updatetime;


}
