package com.company.AbstractFactoryPattern;

import com.company.AbstractFactoryPattern.ProductFamilies.*;

public class ColorFactory extends AbstractFactory<Color, ColorType> {
    @Override
    Color getItem(ColorType type) {
        return switch (type) {
            case RED -> new Red();
            case GREEN -> new Green();
            case BLUE -> new Blue();
        };
    }
}
