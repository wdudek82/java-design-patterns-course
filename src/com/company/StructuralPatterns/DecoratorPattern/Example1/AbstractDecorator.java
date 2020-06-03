package com.company.StructuralPatterns.DecoratorPattern.Example1;

public abstract class AbstractDecorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    public void doJob() {
        if (component != null) {
            component.doJob();
        }
    }
}
