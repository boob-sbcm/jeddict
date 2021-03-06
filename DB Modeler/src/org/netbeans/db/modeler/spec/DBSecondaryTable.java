/**
 * Copyright [2016] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.netbeans.db.modeler.spec;

import java.util.List;
import java.util.Set;
import org.netbeans.jpa.modeler.spec.Entity;
import org.netbeans.jpa.modeler.spec.Index;
import org.netbeans.jpa.modeler.spec.SecondaryTable;
import org.netbeans.jpa.modeler.spec.UniqueConstraint;

public class DBSecondaryTable extends DBBaseTable {

    private final SecondaryTable secondaryTable;

    public DBSecondaryTable(String name, Entity entity, SecondaryTable secondaryTable) {
        super(name, entity);
        this.secondaryTable = secondaryTable;
    }

    @Override
    public Set<UniqueConstraint> getUniqueConstraints() {
        return getSecondaryTable().getUniqueConstraint();
    }

    @Override
    public List<Index> getIndexes() {
        return getSecondaryTable().getIndex();
    }

    /**
     * @return the secondaryTable
     */
    public SecondaryTable getSecondaryTable() {
        return secondaryTable;
    }

}
