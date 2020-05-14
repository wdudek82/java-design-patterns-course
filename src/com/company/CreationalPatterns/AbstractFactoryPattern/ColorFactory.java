package com.company.CreationalPatterns.AbstractFactoryPattern;

import com.company.CreationalPatterns.AbstractFactoryPattern.ProductFamilies.*;

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
