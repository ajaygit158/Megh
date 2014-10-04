/*
 * Copyright (c) 2014 DataTorrent, Inc. ALL Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.datatorrent.contrib.memsql;

import com.datatorrent.lib.db.jdbc.AbstractJdbcNonTransactionableBatchOutputOperator;

/**
 * This is an outpout operator that connects to a memsql database.
 * @param <T> The type of tuples to be processed.
 * @param <S> The connection store to use.
 *
 * @since 1.0.5
 */
public abstract class AbstractMemsqlOutputOperator<T, S extends MemsqlStore> extends AbstractJdbcNonTransactionableBatchOutputOperator<T, S>
{
  @SuppressWarnings("unchecked")
  public AbstractMemsqlOutputOperator()
  {
    this.setStore((S) new MemsqlStore());
  }
}