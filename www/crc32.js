window.crc32 = function(str, callback) {
        cordova.exec(callback, function(err) {
            callback('Nothing to echo.');
        }, "crc32", "echo", [str]);
    };