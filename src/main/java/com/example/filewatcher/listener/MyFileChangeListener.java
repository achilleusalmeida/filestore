package com.example.filewatcher.listener;

import org.springframework.boot.devtools.filewatch.ChangedFile;
import org.springframework.boot.devtools.filewatch.ChangedFiles;
import org.springframework.boot.devtools.filewatch.FileChangeListener;

import java.util.Set;

public class MyFileChangeListener implements FileChangeListener {

    @Override
    public void onChange(Set<ChangedFiles> changeSet) {
        for(ChangedFiles cfiles:changeSet) {
            for(ChangedFile cfile:cfiles.getFiles()) {
                System.out.println(cfile.getType()+":"+cfile.getFile().getName());
            }
        }
    }
}
