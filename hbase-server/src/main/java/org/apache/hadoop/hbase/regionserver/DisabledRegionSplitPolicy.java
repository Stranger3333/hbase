/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.regionserver;

import org.apache.hadoop.hbase.HBaseInterfaceAudience;
import org.apache.yetus.audience.InterfaceAudience;

/**
 * A {@link RegionSplitPolicy} that disables region splits. This should be used with care, since it
 * will disable automatic sharding. Most of the time, using {@link ConstantSizeRegionSplitPolicy}
 * with a large region size (10GB, etc) is safer.
 */
@InterfaceAudience.LimitedPrivate(HBaseInterfaceAudience.CONFIG)
public class DisabledRegionSplitPolicy extends RegionSplitPolicy {

  @Override
  protected boolean shouldSplit() {
    return false;
  }

  @Override
  protected boolean canSplit() {
    return false;
  }
}
