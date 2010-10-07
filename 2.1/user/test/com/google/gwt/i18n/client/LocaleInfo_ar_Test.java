/*
 * Copyright 2008 Google Inc.
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
package com.google.gwt.i18n.client;

import com.google.gwt.junit.client.GWTTestCase;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Tests the LocaleInfo class and the associated generator.
 */
public class LocaleInfo_ar_Test extends GWTTestCase {

  @Override
  public String getModuleName() {
    return "com.google.gwt.i18n.I18NTest_ar";
  }

  public void testCurrentLocale() {
    String locale = LocaleInfo.getCurrentLocale().getLocaleName();
    assertEquals("ar", locale);
  }

  public void testAvailableLocales() {
    String[] locales = LocaleInfo.getAvailableLocaleNames();
    ArrayList<String> localeList = new ArrayList<String>();
    Collections.addAll(localeList, locales);
    assertTrue(localeList.contains("ar"));
    assertTrue(localeList.contains("default"));
  }

  public void testNativeDisplayNames() {
    // verify ar is known
    String displayName = LocaleInfo.getLocaleNativeDisplayName("ar");
    assertEquals("العربية", displayName);
  }
  
  public void testRTL() {
    boolean isRTL = LocaleInfo.getCurrentLocale().isRTL();
    assertTrue(isRTL);
    boolean hasRTL = LocaleInfo.hasAnyRTL();
    assertTrue(hasRTL);
  }
}
