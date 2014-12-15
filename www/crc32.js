exports.getLong = function (str) {
        
        var lng_crc = cordova.exec(null, null, 'crc32', 'getLong', [{"strContent":str}]);
        return 1;
        
}; 
