package com.example

import org.apache.commons.io.IOUtils
import java.io.StringWriter

/**
 * User: Maurício Linhares
 * Date: 2/19/12
 * Time: 9:46 PM
 */

class IOUsage {

  def use {
    IOUtils.closeQuietly( new StringWriter() )
  }

}
