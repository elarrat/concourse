/*
 * Copyright (c) 2013-2021 Cinchapi Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cinchapi.concourse.server.io;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.cinchapi.concourse.util.FileOps;

/**
 * An object that guarantees that it can be durably written to disk.
 * 
 * @author Jeff Nelson
 */
public interface Syncable {

    /**
     * Flush the content of the object to {@code file}. When the method returns,
     * it is guaranteed that all changes made to the object since it was created
     * or since this method was last invoked, will have been written to disk.
     * 
     * @param file
     */
    public void fsync(Path file);

    /**
     * Flush the content of the object to disk. When this method returns, it is
     * guaranteed that all changes made to the object since it was created or
     * since this method was last invoked, will have been written to disk.
     * <p>
     * By default, this method {@link #fsync(Path) fsyncs} to a temporary file.
     * </p>
     */
    public default void sync() {
        fsync(Paths.get(FileOps.tempFile()));
    }

}
