package Polymorphism;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Animal {

    private String voice;
    private String eat;
    private int paws;
    private int tails;
}