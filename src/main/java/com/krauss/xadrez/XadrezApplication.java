package com.krauss.xadrez;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class XadrezApplication extends Application<XadrezConfiguration> {

    public static void main(final String[] args) throws Exception {
        new XadrezApplication().run(args);
    }

    @Override
    public String getName() {
        return "Xadrez";
    }

    @Override
    public void initialize(final Bootstrap<XadrezConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final XadrezConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
