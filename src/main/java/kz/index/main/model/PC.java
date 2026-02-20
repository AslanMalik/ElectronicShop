package kz.index.main.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PC {
    private long id;
    private String name;
    private String description;
    double price;
}
