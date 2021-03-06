/*
 * Copyright 2014 SimplifyOps Inc, <http://simplifyops.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.rundeck.storage.data.file

import spock.lang.Specification


/**
 * FileTreeUtilSpecification is ...
 * @author Greg Schueler <greg@simplifyops.com>
 * @since 2014-10-10
 */
class FileTreeUtilSpecification extends Specification {

    def "pathFromFilepathSubstring returns correct path"() {
        expect:
        FileTreeUtil.pathForRelativeFilepath("a/b/c","/").path == "a/b/c"
        FileTreeUtil.pathForRelativeFilepath("a\\b\\c","\\").path == "a/b/c"
    }
}
