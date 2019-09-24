package edu.vsu.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
public final class Detail {

    @Setter
    @Getter
    private int id;

    @Setter
    @Getter
    private int carId;

    @Setter
    @Getter
    private int detailTypeId;

    @Setter
    @Getter
    private String title;

}