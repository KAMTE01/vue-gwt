package com.axellience.vuegwtexamples.client.examples.extendsjscomponent;

import com.axellience.vuegwt.jsr69.component.annotations.Component;
import com.axellience.vuegwt.jsr69.component.annotations.Computed;
import jsinterop.annotations.JsType;

/**
 * @author Adrien Baron
 */
@Component
@JsType
public class ChildJavaComponent extends ParentJsComponent
{
    public int childValue;

    @Override
    public void created()
    {
        this.childValue = 10;
    }

    public int childMultiplyBy10(int value)
    {
        return value * 10;
    }

    public int childMultiplyBy4(int value)
    {
        return this.parentMultiplyBy2(this.parentMultiplyBy2(value));
    }

    @Computed
    public String getChildComputed()
    {
        return "Child Computed | " + this.childValue;
    }
}