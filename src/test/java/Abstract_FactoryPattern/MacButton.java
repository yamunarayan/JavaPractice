package Abstract_FactoryPattern;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class MacButton implements Button{

    @Override
    public void paint() {
        System.out.println("This is a Mac button");
    }
}
