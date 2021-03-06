JW_APP_NAME.directive('hiddenBsTab', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.ngActivate);
        element.on('hidden.bs.tab', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});
