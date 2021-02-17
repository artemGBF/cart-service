package ru.gbf.cartservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddGoodsDto {
    private Long idGood;
    private Long idCart;
    private Integer count;
}
