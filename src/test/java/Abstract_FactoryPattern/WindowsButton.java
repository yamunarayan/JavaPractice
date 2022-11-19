package Abstract_FactoryPattern;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("This is a Windows button");
    }
}
