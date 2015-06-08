/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Words. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.words.examples.quick_start;
import com.aspose.words.*;
import com.aspose.words.examples.Common;

import java.io.File;

public class AppendDocuments
{
    public static void main(String[] args) throws Exception
    {
        // Get the data directory
        String dataDir = Common.getDataDir();

        // Load the destination and source documents from disk.
        Document dstDoc = new Document(dataDir + "TestFile.Destination.doc");
        Document srcDoc = new Document(dataDir + "TestFile.Source.doc");

        // Append the source document to the destination document while keeping the original formatting of the source document.
        dstDoc.appendDocument(srcDoc, ImportFormatMode.KEEP_SOURCE_FORMATTING);
        dstDoc.save(dataDir + "TestFile Out.docx");

        System.out.println("Document appended successfully.");
    }
}