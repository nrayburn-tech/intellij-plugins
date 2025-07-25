// Copyright 2000-2025 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package org.jetbrains.vuejs.lang.stubs.serializers

import com.intellij.lang.stubs.XmlStubBasedAttributeStubSerializer
import com.intellij.psi.impl.source.xml.stub.XmlAttributeStubImpl
import com.intellij.psi.stubs.IndexSink
import com.intellij.util.PathUtil
import org.jetbrains.vuejs.index.VUE_URL_INDEX_KEY
import org.jetbrains.vuejs.lang.html.parser.VueStubElementTypes.SRC_ATTRIBUTE

class VueSrcAttributeStubSerializer : XmlStubBasedAttributeStubSerializer(SRC_ATTRIBUTE) {
  override fun indexStub(stub: XmlAttributeStubImpl, sink: IndexSink) {
    stub.value
      ?.let { PathUtil.getFileName(it) }
      ?.takeIf { it.isNotBlank() }
      ?.let { sink.occurrence(VUE_URL_INDEX_KEY, it) }
  }
}