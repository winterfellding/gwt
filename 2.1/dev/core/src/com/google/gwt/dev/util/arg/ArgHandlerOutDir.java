/*
 * Copyright 2006 Google Inc.
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
package com.google.gwt.dev.util.arg;

import com.google.gwt.util.tools.ArgHandlerDir;

import java.io.File;

/**
 * Argument handler for processing the output directory flag.
 */
public final class ArgHandlerOutDir extends ArgHandlerDir {

  private final OptionOutDir option;

  public ArgHandlerOutDir(OptionOutDir option) {
    this.option = option;
  }

  @Override
  public String[] getDefaultArgs() {
    return new String[] {getTag(), System.getProperty("user.dir")};
  }

  @Override
  public String getPurpose() {
    return "The directory to write output files into (defaults to current)";
  }

  @Override
  public String getTag() {
    return "-out";
  }

  @Override
  public void setDir(File dir) {
    option.setOutDir(dir);
  }

}
