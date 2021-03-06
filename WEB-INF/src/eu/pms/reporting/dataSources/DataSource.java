package eu.pms.reporting.dataSources;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.JRRewindableDataSource;

import java.util.*;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class DataSource implements JRRewindableDataSource {
    private String[] columns;
    private List<Map<String, Object>> values;
    private Iterator<Map<String, Object>> iterator;
    private Map<String, Object> currentRecord;

    public DataSource(String ...columns) {
        this.columns = columns;
        this.values = new ArrayList<Map<String, Object>>();
    }

    public void add(Object ...values) {
        Map<String, Object> row = new HashMap<String, Object>();
        for (int i = 0; i < values.length; i++) {
            row.put(columns[i], values[i]);
        }
        this.values.add(row);
    }

    public Object getFieldValue(JRField field) throws JRException {
        return currentRecord.get(field.getName());
    }

    public boolean next() throws JRException {
        if (iterator == null) {
            this.iterator = values.iterator();
        }
        boolean hasNext = iterator.hasNext();
        if (hasNext) {
            currentRecord = iterator.next();
        }
        return hasNext;
    }

    public void moveFirst() throws JRException {
        this.iterator = null;
    }
}
