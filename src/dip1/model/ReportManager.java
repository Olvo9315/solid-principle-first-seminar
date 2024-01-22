package dip1.model;

import java.util.List;

import dip1.model.util.ReportPrinter;
import dip1.model.util.Reportable;

public class ReportManager {
    Reportable reportable;

    public ReportManager(Reportable reportable) {
        this.reportable = reportable;
    }
    
    public void output(List<ReportItem> items){
        reportable.output(items);
    }

}
