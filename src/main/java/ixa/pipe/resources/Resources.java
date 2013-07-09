/*
 * Copyright 2013 Rodrigo Agerri

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package ixa.pipe.resources;

import java.io.InputStream;

public class Resources {

  private InputStream segModel;
  private InputStream tokModel;
  private InputStream nonBreaker;

  public InputStream getSegModel(String cmdOption) {

    if (cmdOption.equals("en")) {
      segModel = getClass().getResourceAsStream("/en-sent.bin");
    }

    if (cmdOption.equals("es")) {
      segModel = getClass().getResourceAsStream("/es-sent.bin");
    }
    return segModel;
  }

  public InputStream getTokModel(String cmdOption) {

    if (cmdOption.equals("en")) {
      tokModel = getClass().getResourceAsStream("/en-token.bin");
    }

    if (cmdOption.equals("es")) {
      tokModel = getClass().getResourceAsStream("/es-token.bin");
    }
    return tokModel;
  }

  public InputStream getNonBreakingPrefixes(String cmdOption) {
	  if (cmdOption.equalsIgnoreCase("en")) {
		  nonBreaker = getClass().getResourceAsStream("/nonbreaking_prefix.en");
	  }

	  if (cmdOption.equalsIgnoreCase("es")) {
		  nonBreaker = getClass().getResourceAsStream("/nonbreaking_prefix.es");
	  }
	  return nonBreaker;
  } 
  
}