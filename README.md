# System Monitor

This plugin will monitor the various subsystems required by dotCMS and report on their availability.  It tests cache reads, file system read/writes, index and db availability.


```
hot-fries:com.dotcms.plugin.rest.monitor will$ curl http://localhost:8080/api/v1/system-status
{
  "asset_fs_rw": false,
  "cache": true,
  "dbSelect": true,
  "indexLive": true,
  "indexWorking": true,
  "local_fs_rw": true
}
```
