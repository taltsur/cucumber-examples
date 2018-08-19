package com.example.with.expressions.steps;

import com.example.with.expressions.Color;
import com.example.with.expressions.Grocery;
import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.cucumberexpressions.Transformer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

import java.util.Locale;
import java.util.Map;

import static java.util.Locale.ENGLISH;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineParameterType(new ParameterType<Integer>(
                "digit",
                "[0-9]",
                Integer.class,
                new Transformer<Integer>() {
                    @Override
                    public Integer transform(String s) throws Throwable {
                        return Integer.parseInt(s);
                    }
                })
        );

        typeRegistry.defineParameterType(new ParameterType<Color>(
                "color",           // name
                "RED|BLUE|YELLOW", // regexp
                Color.class,       // type
                new Transformer<Color>() {
                    @Override
                    public Color transform(String s) throws Throwable {
                        return Color.valueOf(s);
                    }
                })
        );
        typeRegistry.defineDataTableType(new DataTableType(
                Grocery.class,
                new TableEntryTransformer<Grocery>() {
                    @Override
                    public Grocery transform(Map<String, String> entry) {
                        return new Grocery(
                                entry.get("name"),
                                Integer.valueOf(entry.get("price"))
                        );
                    }
                }
        ));
    }
}