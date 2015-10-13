/*
 * Cacheonix systems licenses this file to You under the LGPL 2.1
 * (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.cacheonix.org/products/cacheonix/license-lgpl-2.1.htm
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cacheonix.impl.cache.storage.disk;

/**
 * This interface defines a stored object. It is used by the cache subsystem for fast object retrieval.
 */
public interface StoredObject {

   /**
    * @return returns an offest in data file that serialized objected is stored at.
    */
   long getValueOffset();


   /**
    * @return legth of serialized value.
    */
   long getValueLength();
}