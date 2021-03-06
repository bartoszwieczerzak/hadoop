/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.yarn.server.nodemanager.containermanager.resourceplugin.deviceframework;

import org.apache.hadoop.yarn.server.nodemanager.api.deviceplugin.Device;
import org.apache.hadoop.yarn.server.nodemanager.api.deviceplugin.DevicePlugin;
import org.apache.hadoop.yarn.server.nodemanager.api.deviceplugin.DeviceRegisterRequest;
import org.apache.hadoop.yarn.server.nodemanager.api.deviceplugin.DeviceRuntimeSpec;
import org.apache.hadoop.yarn.server.nodemanager.api.deviceplugin.YarnRuntimeType;

import java.util.Set;

/**
 * A normal plugin without customized scheduler.
 */

public class FakeTestDevicePlugin5 implements DevicePlugin {
  @Override
  public DeviceRegisterRequest getRegisterRequestInfo() throws Exception {
    return DeviceRegisterRequest.Builder.newInstance()
        .setResourceName("cmp.com/cmp").build();
  }

  @Override
  public Set<Device> getDevices() throws Exception {
    return null;
  }

  @Override
  public DeviceRuntimeSpec onDevicesAllocated(Set<Device> allocatedDevices,
      YarnRuntimeType yarnRuntime) throws Exception {
    return null;
  }


  @Override
  public void onDevicesReleased(Set<Device> releasedDevices) throws Exception {

  }
}
